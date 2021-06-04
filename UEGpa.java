import java.util.*;
class UEGpa{
    public static void main (String[] args){
        System.out.println("WELCOME TO UE GPA CALCULATOR");
        System.out.println("Coded by Sultan // wwww.sultaan.tech // hello@sultaan.tech");
int c1,c2,c3,c4,c5,c6,ch1,ch2,ch3,ch4,ch5,ch6;
double g1,g2,g3,g4,g5,g6;
g1=0; g2=0; g3=0; g4=0; g5=0; g6=0;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
    String naam=myObj.nextLine();
    System.out.println("Mr. "+naam+", Please enter marks of each subject below. Marks should not be less than 50 or more than 100");
        System.out.println("Enter Marks in COURSE 1: ");
    c1=myObj.nextInt();
        System.out.println("Enter CREDIT HOURSE OF COURSE 1: ");
    ch1=myObj.nextInt();
    if (c1<50 || c1>100){
        g1=0; 
         }
         else if (c1==50){
         g1=2.00;
         }
         else if (c1==51){
         g1=2.05;   
         }
         else if (c1==52) {
         g1=2.10;
         }
         else if (c1==53){
         g1=2.15;
            }
         else if (c1==54){
         g1=2.20;
             }
         else if (c1==55){
         g1=2.25;
         }
         else if (c1==56){
         g1=2.30;
         }
         else if (c1==57){
         g1=2.35;
         }
         else if (c1==58){
         g1=2.40;
             }
         else if (c1==59){
         g1=2.45;
         }
         else if (c1==60){
         g1=2.50;
         }
         else if (c1==61){
         g1=2.55;
        }
         else if (c1==62){
         g1=2.60;
        }
         else if (c1==63){
         g1=2.65;
             }
         else if (c1==64){
         g1=2.70;
         }
         else if (c1==65){
         g1=2.75;
        }
         else if (c1==66){
         g1=2.80;
         }
         else if (c1==67){
         g1=2.85;
         }
         else if (c1==68){
         g1=2.90;
             }
         else if (c1==69){
         g1=2.95;
             }
         else if (c1==70){
         g1=3.00;
         }
         else if (c1==71){
         g1=3.05; 
         }
         else if (c1==72){
         g1=3.10;
         }
         else if (c1==73){
         g1=3.15;
         }
         else if (c1==74){
         g1=3.20;
             }
         else if (c1==75){
         g1=3.25;
         }
         else if (c1==76){
         g1=3.30;
             }
         else if (c1==77){
         g1=3.35;
             }
         else if (c1==78){
         g1=3.40;
             }
         else if (c1==79){
         g1=3.45;
             }
         else if (c1==80){
         g1=3.50;
             }
         else if (c1==81){
         g1=3.55;
             }
         else if (c1==82){
         g1=3.60;
             }
         else if (c1==83){
         g1=3.65;
             }
         else if (c1==84){
         g1=3.70;
             }
         else if (c1==85){
         g1=3.75;
             }
         else if (c1==86) {
         g1=3.80;
             }
         else if (c1==87){
         g1=3.85;
             }
         else if (c1==88){
         g1=3.90;
             }
         else if (c1==89){
         g1=3.95;
         }
         else if (c1>=90){
         g1=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");            }
             double cg1=g1*ch1;
        System.out.println("Enter Marks in COURSE 2: ");
    c2=myObj.nextInt();
    System.out.println("Enter CREDIT HOURSE OF COURSE 2: ");
    ch2=myObj.nextInt();
    if (c2<50 || c2>100){
        g2=0; 
         }
         else if (c2==50){
         g2=2.00;
         }
         else if (c2==51){
         g2=2.05;   
         }
         else if (c2==52) {
         g2=2.10;
         }
         else if (c2==53){
         g2=2.15;
            }
         else if (c2==54){
         g2=2.20;
             }
         else if (c2==55){
         g2=2.25;
         }
         else if (c2==56){
         g2=2.30;
         }

         else if (c2==57){
         g2=2.35;
         }
         else if (c2==58){
         g2=2.40;
             }
         else if (c2==59){
         g2=2.45;
         }
         else if (c2==60){
         g2=2.50;
         }
         else if (c2==61){
         g2=2.55;
        }
         else if (c2==62){
         g2=2.60;
        }
         else if (c2==63){
         g2=2.65;
             }
         else if (c2==64){
         g2=2.70;
         }
         else if (c2==65){
         g2=2.75;
        }
         else if (c2==66){
         g2=2.80;
         }
         else if (c2==67){
         g2=2.85;
         }
         else if (c2==68){
         g2=2.90;
             }
         else if (c2==69){
         g2=2.95;
             }
         else if (c2==70){
         g2=3.00;
         }
         else if (c2==71){
         g2=3.05; 
         }
         else if (c2==72){
         g2=3.10;
         }
         else if (c2==73){
         g2=3.15;
         }
         else if (c2==74){
         g2=3.20;
             }
         else if (c2==75){
         g2=3.25;
         }
         else if (c2==76){
         g2=3.30;
             }
         else if (c2==77){
         g2=3.35;
             }
         else if (c2==78){
         g2=3.40;
             }
         else if (c2==79){
         g2=3.45;
             }
         else if (c2==80){
         g2=3.50;
             }
         else if (c2==81){
         g2=3.55;
             }
         else if (c2==82){
         g2=3.60;
             }
         else if (c2==83){
         g2=3.65;
             }
         else if (c2==84){
         g2=3.70;
             }
         else if (c2==85){
         g2=3.75;
             }
         else if (c2==86) {
         g2=3.80;
             }
         else if (c2==87){
         g2=3.85;
             }
         else if (c2==88){
         g2=3.90;
             }
         else if (c2==89){
         g2=3.95;
         }
         else if (c2>=90){
         g2=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");            }
        System.out.println("Enter Marks in COURSE 3: ");
    c3=myObj.nextInt();
    System.out.println("Enter CREDIT HOURSE OF COURSE 3: ");
    ch3=myObj.nextInt();
    if (c3<50 || c3>100){
        g3=0; 
         }
         else if (c3==50){
         g3=2.00;
         }
         else if (c3==51){
         g3=2.05;   
         }
         else if (c3==52) {
         g3=2.10;
         }
         else if (c3==53){
         g3=2.15;
            }
         else if (c3==54){
         g3=2.20;
             }
         else if (c3==55){
         g3=2.25;
         }
         else if (c3==56){
         g3=2.30;
         }
         else if (c3==57){
         g3=2.35;
         }
         else if (c3==58){
         g3=2.40;
             }
         else if (c3==59){
         g3=2.45;
         }
         else if (c3==60){
         g3=2.50;
         }
         else if (c3==61){
         g3=2.55;
        }
         else if (c3==62){
         g3=2.60;
        }
         else if (c3==63){
         g3=2.65;
             }
         else if (c3==64){
         g3=2.70;
         }
         else if (c3==65){
         g3=2.75;
        }
         else if (c3==66){
         g3=2.80;
         }
         else if (c3==67){
         g3=2.85;
         }
         else if (c3==68){
         g3=2.90;
             }
         else if (c3==69){
         g3=2.95;
             }
         else if (c3==70){
         g3=3.00;
         }
         else if (c3==71){
         g3=3.05; 
         }
         else if (c3==72){
         g3=3.10;
         }
         else if (c3==73){
         g3=3.15;
         }
         else if (c3==74){
         g3=3.20;
             }
         else if (c3==75){
         g3=3.25;
         }
         else if (c3==76){
         g3=3.30;
             }
         else if (c3==77){
         g3=3.35;
             }
         else if (c3==78){
         g3=3.40;
             }
         else if (c3==79){
         g3=3.45;
             }
         else if (c3==80){
         g3=3.50;
             }
         else if (c3==81){
         g3=3.55;
             }
         else if (c3==82){
         g3=3.60;
             }
         else if (c3==83){
         g3=3.65;
             }
         else if (c3==84){
         g3=3.70;
             }
         else if (c3==85){
         g3=3.75;
             }
         else if (c3==86) {
         g3=3.80;
             }
         else if (c3==87){
         g3=3.85;
             }
         else if (c3==88){
         g3=3.90;
             }
         else if (c3==89){
         g3=3.95;
         }
         else if (c3>=90){
         g3=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");            }
             double cg3=g3*ch3;
         System.out.println("Enter Marks in COURSE 4: ");
    c4=myObj.nextInt();
    System.out.println("Enter CREDIT HOURSE OF COURSE 4: ");
    ch4=myObj.nextInt();
    if (c4<50 || c4>100){
        g4=0; 
         }
         else if (c4==50){
         g4=2.00;
         }
         else if (c4==51){
         g4=2.05;   
         }
         else if (c4==52) {
         g4=2.10;
         }
         else if (c4==53){
         g4=2.15;
            }
         else if (c4==54){
         g4=2.20;
             }
         else if (c4==55){
         g4=2.25;
         }
         else if (c4==56){
         g4=2.30;
         }
         else if (c4==57){
         g4=2.35;
         }
         else if (c4==58){
         g4=2.40;
             }
         else if (c4==59){
         g4=2.45;
         }
         else if (c4==60){
         g4=2.50;
         }
         else if (c4==61){
         g4=2.55;
        }
         else if (c4==62){
         g4=2.60;
        }
         else if (c4==63){
         g4=2.65;
             }
         else if (c4==64){
         g4=2.70;
         }
         else if (c4==65){
         g4=2.75;
        }
         else if (c4==66){
         g4=2.80;
         }
         else if (c4==67){
         g4=2.85;
         }
         else if (c4==68){
         g4=2.90;
             }
         else if (c4==69){
         g4=2.95;
             }
         else if (c4==70){
         g4=3.00;
         }
         else if (c4==71){
         g4=3.05; 
         }
         else if (c4==72){
         g4=3.10;
         }
         else if (c4==73){
         g4=3.15;
         }
         else if (c4==74){
         g4=3.20;
             }
         else if (c4==75){
         g4=3.25;
         }
         else if (c4==76){
         g4=3.30;
             }
         else if (c4==77){
         g4=3.35;
             }
         else if (c4==78){
         g4=3.40;
             }
         else if (c4==79){
         g4=3.45;
             }
         else if (c4==80){
         g4=3.50;
             }
         else if (c4==81){
         g4=3.55;
             }
         else if (c4==82){
         g4=3.60;
             }
         else if (c4==83){
         g4=3.65;
             }
         else if (c4==84){
         g4=3.70;
             }
         else if (c4==85){
         g4=3.75;
             }
         else if (c4==86) {
         g4=3.80;
             }
         else if (c4==87){
         g4=3.85;
             }
         else if (c4==88){
         g4=3.90;
             }
         else if (c4==89){
         g4=3.95;
         }
         else if (c4>=90){
         g4=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");           
             }
    double cg4=g4*ch4;
        System.out.println("Enter Marks in COURSE 5: ");
    c5=myObj.nextInt();
        System.out.println("Enter CREDIT HOURSE OF COURSE 5: ");
    ch5=myObj.nextInt();
    if (c5<50 || c5>100){
        g5=0; 
         }
         else if (c5==50){
         g5=2.00;
         }
         else if (c5==51){
         g5=2.05;   
         }
         else if (c5==52) {
         g5=2.10;
         }
         else if (c5==53){
         g5=2.15;
            }
         else if (c5==54){
         g5=2.20;
             }
         else if (c5==55){
         g5=2.25;
         }
         else if (c5==56){
         g5=2.30;
         }
         else if (c5==57){
         g5=2.35;
         }
         else if (c5==58){
         g5=2.40;
             }
         else if (c5==59){
         g5=2.45;
         }
         else if (c5==60){
         g5=2.50;
         }
         else if (c5==61){
         g5=2.55;
        }
         else if (c5==62){
         g5=2.60;
        }
         else if (c5==63){
         g5=2.65;
             }
         else if (c5==64){
         g5=2.70;
         }
         else if (c5==65){
         g5=2.75;
        }
         else if (c5==66){
         g5=2.80;
         }
         else if (c5==67){
         g5=2.85;
         }
         else if (c5==68){
         g5=2.90;
             }
         else if (c5==69){
         g5=2.95;
             }
         else if (c5==70){
         g5=3.00;
         }
         else if (c5==71){
         g5=3.05; 
         }
         else if (c5==72){
         g5=3.10;
         }
         else if (c5==73){
         g5=3.15;
         }
         else if (c5==74){
         g5=3.20;
             }
         else if (c5==75){
         g5=3.25;
         }
         else if (c5==76){
         g5=3.30;
             }
         else if (c5==77){
         g5=3.35;
             }
         else if (c5==78){
         g5=3.40;
             }
         else if (c5==79){
         g5=3.45;
             }
         else if (c5==80){
         g5=3.50;
             }
         else if (c5==81){
         g5=3.55;
             }
         else if (c5==82){
         g5=3.60;
             }
         else if (c5==83){
         g5=3.65;
             }
         else if (c5==84){
         g5=3.70;
             }
         else if (c5==85){
         g5=3.75;
             }
         else if (c5==86) {
         g5=3.80;
             }
         else if (c5==87){
         g5=3.85;
             }
         else if (c5==88){
         g5=3.90;
             }
         else if (c5==89){
         g5=3.95;
         }
         else if (c5>=90){
         g5=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");  
             }
    
             double cg5=g5*ch5;
    System.out.println("Enter Marks in COURSE 6: ");
    c6=myObj.nextInt();
        System.out.println("Enter CREDIT HOURSE OF COURSE 6: ");
    ch6=myObj.nextInt();
    if (c6<50){
        g6=0; 
         }
         else if (c6==50){
         g6=2.00;
         }
         else if (c6==51){
         g6=2.05;   
         }
         else if (c6==52) {
         g6=2.10;
         }
         else if (c6==53){
         g6=2.15;
            }
         else if (c6==54){
         g6=2.20;
             }
         else if (c6==55){
         g6=2.25;
         }
         else if (c6==56){
         g6=2.30;
         }
         else if (c6==57){
         g6=2.35;
         }
         else if (c6==58){
         g6=2.40;
             }
         else if (c6==59){
         g6=2.45;
         }
         else if (c6==60){
         g6=2.50;
         }
         else if (c6==61){
         g6=2.55;
        }
         else if (c6==62){
         g6=2.60;
        }
         else if (c6==63){
         g6=2.65;
             }
         else if (c6==64){
         g6=2.70;
         }
         else if (c6==65){
         g6=2.75;
        }
         else if (c6==66){
         g6=2.80;
         }
         else if (c6==67){
         g6=2.85;
         }
         else if (c6==68){
         g6=2.90;
             }
         else if (c6==69){
         g6=2.95;
             }
         else if (c6==70){
         g6=3.00;
         }
         else if (c6==71){
         g6=3.05; 
         }
         else if (c6==72){
         g6=3.10;
         }
         else if (c6==73){
         g6=3.15;
         }
         else if (c6==74){
         g6=3.20;
             }
         else if (c6==75){
         g6=3.25;
         }
         else if (c6==76){
         g6=3.30;
             }
         else if (c6==77){
         g6=3.35;
             }
         else if (c6==78){
         g6=3.40;
             }
         else if (c6==79){
         g6=3.45;
             }
         else if (c6==80){
         g6=3.50;
             }
         else if (c6==81){
         g6=3.55;
             }
         else if (c6==82){
         g6=3.60;
             }
         else if (c6==83){
         g6=3.65;
             }
         else if (c6==84){
         g6=3.70;
             }
         else if (c6==85){
         g6=3.75;
             }
         else if (c6==86) {
         g6=3.80;
             }
         else if (c6==87){
         g6=3.85;
             }
         else if (c6==88){
         g6=3.90;
             }
         else if (c6==89){
         g6=3.95;
         }
         else if (c6>=90){
         g6=4.00;
             }
         else{
             System.out.println("You have entered wrong marks range in one of the subjects");  
            }
    double cg2=g2*ch2;
    double cg6=g6*ch6;
    int totalch=ch1+ch2+ch3+ch4+ch5+ch6;
    double totalqg=cg1+cg2+cg3+cg4+cg5+cg6;
    double overGPA=totalqg/totalch;
myObj.close();
        System.out.println("Total Credi Hours: "+totalch);
            System.out.println("GPA of Course 1 is: "+g1);
            System.out.println("GPA of Course 2 is: "+g2);
            System.out.println("GPA of Course 3 is: "+g3);
            System.out.println("GPA of Course 4 is: "+g4);
            System.out.println("GPA of Course 5 is: "+g5);
            System.out.println("GPA of Course 6 is: "+g6);
            System.out.println("Mr. "+naam+" your overall GPA of this semester is: "+overGPA);
            
    }
}