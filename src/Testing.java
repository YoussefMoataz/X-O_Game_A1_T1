public class Testing {

    // Youssef
    public void test1(){
        Board b = new Board(3);

        b.update(2,0, MainUtils.X);
        b.update(2,1, MainUtils.X);
        b.update(2,2, MainUtils.X);

        b.displayBoard();

        System.out.println(b.isWinner(MainUtils.X));
    }

    // Youssef
    public void test2(){

        Board b = new Board(3);

        b.update(0,2, MainUtils.O);
        b.update(1,2, MainUtils.O);
        b.update(2,2, MainUtils.O);

        b.displayBoard();

        System.out.println(b.isWinner(MainUtils.O));

    }

}
