import java.util.Scanner;

public class gymconsole1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("***********************");
        System.out.println("Welcome to the GYM BUDDY");
        System.out.println("***********************");
        boolean isRunning = true;
        while(isRunning==true) {
            System.out.println("***********************");
            System.out.println("1. DOTS score");
            System.out.println("2. Choose Workout Plan");
            System.out.println("3. Log Today's Workout");
            System.out.println("4. BMI(body mass index)");
            System.out.println("5. Exit");
            System.out.println("***********************");
            System.out.println("choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> strengthscore();
                case 2 -> workoutplan();
                case 3 -> logw();
                case 4 -> BMIbro();
                case 5 -> isRunning = false;
                default -> System.out.println("invalid input");
            }
        }


    }

    static void strengthscore(){
        System.out.println("STRENGTH SCORE");
        System.out.println("calculate DOTS scores ");
        System.out.println("enter every value in kgs");
        System.out.println("enter your gender(1-male,2-female): ");
        int gender = scanner.nextInt();
        if(gender == 1){
            System.out.println("enter your weight in kgs: ");
            double weight = scanner.nextDouble();
            System.out.println("enter your bench max in kgs for 1 rep: ");
            double bench = scanner.nextDouble();
            System.out.println("enter your squat in kgs for 1 rep: ");
            double squat = scanner.nextDouble();
            System.out.println("enter your deadlift max for 1 rep:");
            double dead = scanner.nextDouble();
            double total = bench+dead+squat;
            double dots = total * (500 / (
                    47.46178854
                            + 8.472061379 * weight
                            - 0.07369410346 * Math.pow(weight, 2)
                            + 0.0002586110512 * Math.pow(weight, 3)
                            - 0.0000003634089054 * Math.pow(weight, 4)
                            + 0.000000001790898013 * Math.pow(weight, 5)
            ));


            System.out.println("Your DOTS score is: "+ dots);
            if(dots<250){
                System.out.println("you are a beginner and you are still building strength and technique ");
            }else if(dots>=250 && dots<300){
                System.out.println("you are a NOVICE and you are training regularly and starting to gain real strength");
            }else if(dots>=300 && dots<350){
                System.out.println("you are an Intermediate lifter and you are a Strong lifter. Usually 1–2 years of " +
                        "structured training");
            }else if(dots>=350 && dots<400){
                System.out.println("you are in advanced category and having a solid umber of lifts");
            }else if(dots>=400 && dots<450){
                System.out.println("you are an elite level lifter");
            }else if(dots>=450 && dots<500){
                System.out.println("you are an international level pro");
            }else if(dots>=500){
                System.out.println("you are world class");
            }
        }else if(gender == 2){
            System.out.println("DOTS score for female");
            System.out.println("enter your weight in kgs: ");
            double weight1 = scanner.nextDouble();
            System.out.println("enter your bench max in kgs for 1 rep: ");
            double bench1 = scanner.nextDouble();
            System.out.println("enter your squat in kgs for 1 rep: ");
            double squat1 = scanner.nextDouble();
            System.out.println("enter your deadlif max for 1 rep:");
            double dead1 = scanner.nextDouble();
            double total = bench1+dead1+squat1;
            double dots1 = total * (500 / (
                    -125.4255398
                            + 13.71219419 * weight1
                            - 0.03307250631 * Math.pow(weight1, 2)
                            + 0.00004809990691 * Math.pow(weight1, 3)
                            - 0.00000003622531999 * Math.pow(weight1, 4)
                            + 0.000000000105123006 * Math.pow(weight1, 5)
            ));





            System.out.println("Your DOTS score is: "+dots1);

            if(dots1<200){
                System.out.println("you are a beginner and you are still building strength and technique ");
            }else if(dots1>=200 && dots1<250){
                System.out.println("you are a NOVICE and you are training regularly and starting to gain real strength");
            }else if(dots1>=250 && dots1<300){
                System.out.println("you are an Intermediate lifter and you are a Strong lifter. Usually 1–2 years of " +
                        "structured training");
            }else if(dots1>=300 && dots1<350){
                System.out.println("you are in advanced category and having a solid umber of lifts");
            }else if(dots1>=350 && dots1<400){
                System.out.println("you are an elite level lifter");
            }else if(dots1>=400 && dots1<450){
                System.out.println("you are an international level pro");
            }else if(dots1>=450){
                System.out.println("you are world class");
            }
        }






    }


    static void workoutplan(){
        System.out.println("here are some workout plan: ");
        System.out.println("1. Push day\n" +
                "2. pull day\n" +
                "3. legs");
        System.out.println("choose your workout plan");
        int choice1 = gymconsole1.scanner.nextInt();
        if(choice1==1){
            System.out.println("this is your workout for pushday");
            System.out.println("Chest: Barbell Bench Press, Incline Dumbbell Press, Dumbbell Flys\n" +
                    "Shoulders: Overhead Press (Barbell/Dumbbell), Lateral Raises\n" +
                    "Triceps: Triceps Dips, Skull Crushers, Triceps Extensions/Pushdowns ");
        }else if(choice1 == 2){
            System.out.println("this is your workout for pull day");
            System.out.println("Back: Pull-ups/Lat Pulldowns, Bent-Over Rows (Barbell/Dumbbell), Cable Rows, Face Pulls\n" +
                    "Biceps: Barbell Curls, Hammer Curls, Preacher Curls ");
        }else if(choice1 == 3){
            System.out.println("here is your workout for legs");
            System.out.println("Quads/Glutes: Barbell Squats, Leg Press, Lunges, Leg Extensions\n" +
                    "Hamstrings: Romanian Deadlifts, Lying/Seated Leg Curls\n" +
                    "Calves: Calf Raises (Seated/Standing)\n" +
                    "Core (Optional): Hanging Leg Raises, Cable Crunches ");
        }else{
            System.out.println("invalid entry");
        }
    }
    static void logw(){
        System.out.println("log in your workout duration in min:");
        int duration = gymconsole1.scanner.nextInt();
        double calories = duration*8;
        System.out.println("you have burned "+calories+" calories by working out "+duration+"min");
    }
    static void BMIbro(){

        System.out.println("enter your weight in kg: ");
        double weight = gymconsole1.scanner.nextDouble();
        System.out.println("enter your height in meters: ");
        double height = gymconsole1.scanner.nextDouble();
        System.out.println("YOUR BMI IS ");
        System.out.println(".....");
        double BMI = weight/(height*height);
        System.out.println(BMI);
        if(BMI<18.5){
            System.out.println("you are under weight");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("you are in the normal category");
        }else if(BMI>=24.9 && BMI<=29.9){
            System.out.println("you are overweight");
        }else if(BMI>=30 && BMI<=34.9){
            System.out.println("you are in obesity class 1");
        }else if(BMI>=35 && BMI<=39.9){
            System.out.println("you are in obesity class 2");
        }else if(BMI>=40){
            System.out.println("you are in obesity class 2");
        }else{
            System.out.println("invalid BMI");
        }



    }
}

