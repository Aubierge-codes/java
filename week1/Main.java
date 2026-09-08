public class Main {
    public static void main(String[] args){
        int age = 16;
        double average = 96.5;
        String name = "Aubierge";
        char grade = 'A';
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(average);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(isStudent);

        System.out.println("Hello, Java!");

         int a = 20;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


    
        System.out.println(age == 16);
        System.out.println(age == 18);
        System.out.println(age != 16);
        System.out.println(age > 15);
        System.out.println(age < 15);
        System.out.println(age >= 16);
        System.out.println(age <= 10);

         int score = 75;

        if (score >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed.");
        }


        boolean hasPermission = true;

        System.out.println(age >= 16 && score >= 50);
        System.out.println(age >= 18 || score >= 80);
        System.out.println(!hasPermission);

        int number = 1;

        switch (number) {
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    case 3:
        System.out.println("Three");
        break;

    case 4:
        System.out.println("Four");
        break;

    default:
        System.out.println("Something else");
}



while (number <= 3) {
    System.out.println(number);
    number = number + 1;
}


    for (int i = 1; i <= 2; i = i + 1) {

    for (int j = 1; j <= 3; j = j + 1) {
        System.out.println(i + " " + j);
    }
    }

    int[] scores = {80, 90, 75};

System.out.println(scores[0]);
System.out.println(scores[1]);
System.out.println(scores[2]);


int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < 5; i = i + 1) {
    System.out.println(numbers[i]);
}

}

}
