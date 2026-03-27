import java.util.*;
class bonesprj
{
  public static void main(String args[])
  {
      int i=0;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Total bones in Human Body:    206");
      System.out.println("                                 ");
            String bodyParts[]={"Skull","Ribcage","vertebral Column","Upper Limb","Lower Limb","Hand","Foot","Facial",
                                "Ear","Pectoral Girdle","Pelvic Girdle"};
            String skullBones[]={"Frontal","Temporal","Occipital","Parietal","Sphenoid","Ethmoid"};
            int skullqty[]={1,2,1,2,1,1};
            String ribBones[]={"True Ribs","False Ribs","Floating Ribs","Sturnum"};
            int ribsqty[]={14,6,4,1};
            String vertebralBones[]={"Cervical","Thoracic","Lumbar","Sacrum","Coccyx"};
            int vertrbralqty[]={7,12,5,1,1};
            String upperLimbsBones[]={"Humerus","Radial","ulna"};
            int upperLimbsqty[]={2,2,2};
            String lowerLimbsBones[]={"Femur","Tibia","Fibula","Patella"};
            int lowerLimbsqty[]={2,2,2,2};
            String handBones[]={"Carpals","Metacarpals","Phalanges"};
            int handqty[]={8,5,14};
            String footBones[]={"tarsals","Metatarsals","Phalanges"};
            int footqty[]={7,5,14};
            String facialBones[]={"Madible","Maxilla","Zygometric","Lacrimal","Nasal","Nasal conchae","Palatina","vomer"
                                 ,"Hyoid"};
            int facialqty[]={1,2,2,2,2,2,2,1,1};
            String earbones[]={"Malus","Incus","Stapes"};
            int earqty[]={2,2,2};
            String pectoralBones[]={"Clavical","Scapula"};
            int pectoralqty[]={2,2};
            String pelvicBones[]={"(Hip Bone)Coxal Bone"};
            int pelvicqty[]={2};
            String allBones[][]={skullBones,ribBones,vertebralBones,upperLimbsBones,lowerLimbsBones,handBones,
                                 footBones,facialBones,earbones,pectoralBones,pelvicBones};
            int allqty[][]={skullqty,ribsqty,vertrbralqty,upperLimbsqty,handqty,footqty,facialqty,earqty,pectoralqty
                              ,pelvicqty};
            System.out.println("Body Parts:");
                 for(i=0;i<bodyParts.length;i++)
                 {
                  System.out.println((i+1)+"."+bodyParts[i]);
                 }
                 System.out.println("                                       ");
                 System.out.println("Enter the Body Parts Number:");
                 int partChoice=sc.nextInt();
                 if(partChoice<1  ||   partChoice>bodyParts.length)
                 {
                     System.out.println("Invalid bodypart number please enter the right choice"+bodyParts.length+".");
                 }
                 else
                 {
                        int index= partChoice-1;
                        System.out.println("you selected:"+bodyParts[index]);
                        System.out.println("                                     ");
                        String bones[]=allBones[index];
                        int qty[]=allqty[index];
                        System.out.println("Bones in"+bodyParts[index]+":");
                        for(i=0;i<bones.length;i++)
                        {
                            System.out.println((i+1)+"."+bones[i]);
                        }
                        System.out.println("                                            ");
                        System.out.println("Enter Bone no. to check the quantity");
                        int boneChoice=sc.nextInt();
                        if(boneChoice<1 || boneChoice>bones.length)
                         System.out.println("Invalid bones number please enter the right choice"+bones.length+".");
                         else
                           {
                            System.out.println("Bone Selected:"+bones[boneChoice-1]);
                            System.out.println("Quantity  =  "+qty[boneChoice-1]);
                           }
                 }
                    
   }
}
                
                              
                              
                                
            

      
    
    
