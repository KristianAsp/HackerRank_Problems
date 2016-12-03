package Challenges.Thirty_Days_Of_Coding;

/**
 * Created by Kristian André Aspevik on 30/11/2016.
 * https://www.hackerrank.com/challenges/30-class-vs-instance
 */
public class Day_4 {

    class Person {
        private int age;

        public Person(int initialAge){
            if(initialAge >= 0) {
                this.age = initialAge;
            }
            else{
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }
        }

        public void yearPasses(){
            this.age++;
        }

        public void amIOld(){
            String result;
            if(age < 13){
                result = "You are young.";
            }
            else if(age > 12 && age < 18){
                result = "You are a teenager.";
            }
            else{
                result = "You are old.";
            }

            System.out.println(result);
        }
    }

}
