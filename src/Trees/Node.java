package Trees;

public class Node 
{
    public int nodeID;
    public String question;
    public Node yesBranch; //left
    public Node noBranch; //right
    public Node(){}
    
    public Node(int newNodeID, String question)
    {
        this.nodeID = newNodeID;
        this.question = question;
        this.yesBranch = null;
        this.noBranch = null;
    }
    public void displayNode()
    {
        System.out.println("Node ID = " + this.nodeID + ", " + this.question);
    }
}