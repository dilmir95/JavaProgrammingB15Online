package replit;

public class TaskMonkey {

    public static void main(String[] args) {

        int numOfMonkeys = 5;

        while(numOfMonkeys>=1){
            System.out.println(numOfMonkeys+ " little monkeys jumping on the bed,\n" +
                    "1 fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
            -- numOfMonkeys;

        }



        /*
        5 little monkeys jumping on the bed,
1 fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
4 little monkeys jumping on the bed,
1 fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
3 little monkeys jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
2 little monkeys jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
1 little monkey jumping on the bed,
One fell down and bumped his head,
Mama called the doctor and the doctor said,
No more monkeys jumping on the bed!
Put those monkeys right to bed!

         */
    }
}
