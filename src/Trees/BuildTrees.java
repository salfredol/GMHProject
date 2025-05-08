package Trees;
import dbutils.*;

public class BuildTrees 
{
    public static void BuildAllInterviewQuestionSets()
    {
        GlobalData.ATQSet = BuildATQSet();
        
        GlobalData.BloodTypeQSet = BuildBloodTypeQSet();
        GlobalData.TobaccoQSet = BuildTobaccoQSet();
        GlobalData.AlcoholQSet = BuildAlcoholQSet();
        GlobalData.DrugQSet = BuildDrugQSet();
    }
    
    public static Decision BuildATQSet()
    {
        Decision activityTree = new Decision();
        
        activityTree.createRoot(1, "Did you have more trouble with the activity "
                + "of “eating” as compared to yesterday?");
        
        activityTree.insertYesNode(1, 2, "Understood, thank you for your time."
                + " Recorded: activity eating, dectol 1, qty 1");
        activityTree.insertNoNode(1, 3, "Did you have more trouble with the activity "
                + "of “drinking” as compared to yesterday?");
                
        activityTree.insertYesNode(3, 4, "Understood, thank you for your time."
                + "Recorded: activity drinking, dectol 1, qty 1");
        activityTree.insertNoNode(3, 5, "Did you have more trouble with the activity "
                + "of “getting dressed” as compared to yesterday?");
        
        activityTree.insertYesNode(5, 6, "Understood, thank you for your time."
                + "Recorded: activity getting dressed, dectol 1, qty 1");
        activityTree.insertYesNode(5, 7, "Did you have more trouble with the activity "
         + "of “walking around the houses” as compared to yesterday?");
        
        activityTree.insertYesNode(7, 9, "Understood, thank you for your time."
                + "Recorded: activity walking around house, dectol 1, qty 1");
        activityTree.insertNoNode(7, 8, "Did you have more trouble with the activity "
                + "of “climbing stairs” as compared to yesterday?");
        
        activityTree.insertYesNode(8, 10, "Were you able to climb 4-6 steps?");
        activityTree.insertNoNode(8, 11, "Understood, thank you for your time."
                + "Recorded: activity climb stairs, dectol 1, qty 1");
        
        activityTree.insertYesNode(10, 12, "Were you able to climb 7-10 steps?.");
        activityTree.insertNoNode(10, 13, "Understood, thank you for your time."
                + "Recorded: activity climb stairs, dectol 1, qty 0");
        
        activityTree.insertYesNode(12, 14, "Understood, thank you for your time."
                + "Recorded: activity climb stairs, dectol 1, qty 10");
        activityTree.insertNoNode(12, 15, "Understood, thank you for your time."
                + "Recorded: activity climb stairs, dectol 0, qty 6");
        
        return activityTree;
    }
    
    public static Decision BuildBloodTypeQSet()
    {
        Decision bloodTree = new Decision();
        bloodTree.createRoot(1, "You are about to be interviewed for your general medical history, "
                + " starting with questions about your blood. Is that ok?"); 
        
        //treeName.nodeType.(attach ID, node ID, "question");
        bloodTree.insertYesNode(1, 2, "Do you know your blood type?"); 
        bloodTree.insertNoNode(1, 3, "We understand, thank you for your time.");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(2, 4, "Is your blood type O?");
        bloodTree.insertNoNode(2, 5, "We recommend consulting your healthcare provider to determine your blood type.");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(4, 6, "Is your blood type O+?");
        bloodTree.insertNoNode(4, 9, "Is your blood type A?");
        
        bloodTree.insertYesNode(6, 7, "Recorded values: blood type O, Rh factor +");
        bloodTree.insertNoNode(6, 8, "Recorded values: blood type O, Rh factor -");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(9, 10, "Is your blood type A+?");
        bloodTree.insertNoNode(9, 11, "Is your blood type B?");
        
        bloodTree.insertYesNode(10, 14, "Recorded values: blood type A, Rh factor +");
        bloodTree.insertNoNode(10, 15, "Recorded values: blood type A, Rh factor -");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(11, 16, "Is your blood type B+?");
        bloodTree.insertNoNode(11, 19, "Is your blood type AB+?");

        bloodTree.insertYesNode(16, 17, "Recorded values: blood type B, Rh factor +");
        bloodTree.insertNoNode(16, 18, "Recorded values: blood type B, Rh factor -");
        //DEAD END; go to next interview

        bloodTree.insertYesNode(19, 20, "Recorded values: blood type AB, Rh factor +");
        bloodTree.insertNoNode(19, 21, "Recorded values: blood type AB, Rh factor -");
        //DEAD END; go to next interview

        return bloodTree;
    }
    public static Decision BuildTobaccoQSet()
    {
        Decision tobaccoTree = new Decision();
        tobaccoTree.createRoot(1, "Do you regularly use tobacco?"); 
        
        tobaccoTree.insertYesNode(1, 2, "Do you use more than 5 tobacco products per day?");
        tobaccoTree.insertNoNode(1, 3, "Recorded: N");
        //DEAD END

        tobaccoTree.insertYesNode(2, 4, "Have you used tobacco for more than 1 year?");
        tobaccoTree.insertNoNode(2, 5, "Have you used tobacco for more than 1 year?");
        
        tobaccoTree.insertYesNode(5, 8, "Recorded: Light, Long term, Y");
        tobaccoTree.insertNoNode(5, 9, "Recorded: Light, Short term, Y");
        //DEAD END

        tobaccoTree.insertYesNode(4, 6, "Recorded: Heavy, Long term, Y");
        tobaccoTree.insertNoNode(4, 7, "Recorded: Heavy, Short term, Y");
        //DEAD END
        
        return tobaccoTree;
    }
    public static Decision BuildAlcoholQSet()
    {
        Decision alcoholTree = new Decision();
        alcoholTree.createRoot(1, "Do you regularly consume alcohol?");

        alcoholTree.insertYesNode(1, 2, "Do you drink more than 3 times per week?");
        alcoholTree.insertNoNode(1, 3, "Recorded: N");
        // DEAD END

        alcoholTree.insertYesNode(2, 4, "Have you been drinking regularly for more than 1 year?");
        alcoholTree.insertNoNode(2, 5, "Recorded: Moderate, Short term, Y");
        // DEAD END

        alcoholTree.insertYesNode(4, 6, "Recorded: Heavy, Long term, Y");
        alcoholTree.insertNoNode(4, 7, "Recorded: Heavy, Short term, Y");
        // DEAD END

        return alcoholTree;
    }
    public static Decision BuildDrugQSet()
    {
        Decision drugTree = new Decision();
        drugTree.createRoot(1, "Do you currently use any recreational drugs?");

        drugTree.insertYesNode(1, 2, "Do you use cannabis?");
        drugTree.insertNoNode(1, 20, "Recorded: N");
        //DEAD END

        //Cannabis path
        drugTree.insertYesNode(2, 3, "Do you use stimulants (e.g., cocaine, amphetamines)?");
        drugTree.insertNoNode(2, 10, "Do you use for more than 1 year? (Cannabis)");

        //Stimulant path
        drugTree.insertYesNode(3, 4, "Do you use depressants (e.g., benzodiazepines)?");
        drugTree.insertNoNode(3, 11, "Do you use for more than 1 year? (Cannabis, Stimulants)");

        drugTree.insertYesNode(4, 5, "Do you use hallucinogens (e.g., LSD, psilocybin)?");
        drugTree.insertNoNode(4, 12, "Do you use for more than 1 year? (Cannabis, Stimulants, Depressants)");

        //Hallucinogen path
        drugTree.insertYesNode(5, 13, "Do you use for more than 1 year? (Cannabis, Stimulants, Depressants, Hallucinogens)");
        drugTree.insertNoNode(5, 14, "Do you use for more than 1 year? (Cannabis, Stimulants, Depressants, Hallucinogens)");

        drugTree.insertNoNode(10, 15, "Recorded: Cannabis, Short term, Y");
        drugTree.insertYesNode(10, 16, "Recorded: Cannabis, Long term, Y");

        drugTree.insertNoNode(11, 17, "Recorded: Cannabis, Stimulants, Short term, Y");
        drugTree.insertYesNode(11, 18, "Recorded: Cannabis, Stimulants, Long term, Y");

        drugTree.insertNoNode(12, 19, "Recorded: Cannabis, Stimulants, Depressants, Short term, Y");
        drugTree.insertYesNode(12, 21, "Recorded: Cannabis, Stimulants, Depressants, Long term, Y");

        drugTree.insertNoNode(13, 22, "Recorded: Cannabis, Stimulants, Depressants, Hallucinogens, Short term, Y");
        drugTree.insertYesNode(13, 23, "Recorded: Cannabis, Stimulants, Depressants, Hallucinogens, Long term, Y");

        drugTree.insertNoNode(14, 22, "Recorded: Cannabis, Stimulants, Depressants, Hallucinogens, Short term, Y");
        drugTree.insertYesNode(14, 23, "Recorded: Cannabis, Stimulants, Depressants, Hallucinogens, Long term, Y");

        return drugTree;
    }
}