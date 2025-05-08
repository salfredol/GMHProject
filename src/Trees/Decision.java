package Trees;
import javax.swing.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import dbutils.GlobalData;

public class Decision 
{
    private Node root;
    
    public static Queue<String> logQueue = new LinkedList<>();
    
    public Decision() 
    {
        this.root = null;
    }

    public Node getRoot() 
    {
        return root;
    }

    public void createRoot(int newRootNodeID, String question) 
    {
        root = new Node(newRootNodeID, question);
    }

    public void insertYesNode(int existingNodeID, int newNodeID, String question) 
    {
        Node newNode = new Node(newNodeID, question);
        Stack<Node> bTreeStack = new Stack<>();
        bTreeStack.push(root);
        while (!bTreeStack.isEmpty()) 
        {
            Node next = bTreeStack.pop();
            if (existingNodeID == next.nodeID) 
            {
                if (next.yesBranch == null) 
                {
                    next.yesBranch = newNode;
                    return;
                }
            }
            if (next.yesBranch != null) 
            {
                bTreeStack.push(next.yesBranch);
            }
            if (next.noBranch != null) 
            {
                bTreeStack.push(next.noBranch);
            }
        }
    }

    public void insertNoNode(int existingNodeID, int newNodeID, String question) 
    {
        Node newNode = new Node(newNodeID, question);
        Stack<Node> bTreeStack = new Stack<>();
        bTreeStack.push(root);
        while (!bTreeStack.isEmpty()) 
        {
            Node next = bTreeStack.pop();
            if (existingNodeID == next.nodeID) 
            {
                if (next.noBranch == null) 
                {
                    next.noBranch = newNode;
                    return;
                }
            }
            if (next.yesBranch != null) 
            {
                bTreeStack.push(next.yesBranch);
            }
            if (next.noBranch != null) 
            {
                bTreeStack.push(next.noBranch);
            }
        }
    }

    public void queryTree(Node currentNode, String context) 
    {
        if(currentNode.yesBranch == null && currentNode.noBranch == null) 
        {
            JOptionPane.showMessageDialog(null, currentNode.question);

            switch (context) 
            {
                case "blood":
                    GlobalData.BloodTypeResult = currentNode.question;
                    break;
                case "alcohol":
                    GlobalData.AlcoholUseResult = currentNode.question;
                    break;
                case "drug":
                    GlobalData.DrugUseResult = currentNode.question;
                    break;
                case "tobacco":
                    GlobalData.TobaccoUseResult = currentNode.question;
                    break;
                case "activity":
                    GlobalData.ATResult = currentNode.question;
            }
            return;
        }
        askQuestion(currentNode, context);
    }

    public void askQuestion(Node currentNode, String context) 
    {
        String reply = "";
        
        int response = JOptionPane.showConfirmDialog(null, currentNode.question,
                "Interview", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) 
        {
            if (currentNode.yesBranch != null) 
            {
                queryTree(currentNode.yesBranch, context);
                reply = "YES";
            }
        } 
        else if (response == JOptionPane.NO_OPTION) 
        {
            if (currentNode.noBranch != null) 
            {
                queryTree(currentNode.noBranch, context);
                reply = "NO"; // Corrected
            }
        }
        String logLine = "QUESTION: " + currentNode.question + " | ANSWER: " + reply;
        logQueue.add(logLine);
    }
}
