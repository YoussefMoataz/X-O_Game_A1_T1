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


    public void test3(){

        Board b = new Board(3);

        b.update(0,0, MainUtils.X);
        b.update(1,1, MainUtils.X);
        b.update(2,2, MainUtils.X);

        b.displayBoard();

        System.out.println(b.isWinner(MainUtils.X));

    }

    public void test4(){

        Board b = new Board(3);

        b.update(0,2, MainUtils.O);
        b.update(1,1, MainUtils.O);
        b.update(2,0, MainUtils.O);

        b.displayBoard();

        System.out.println(b.isWinner(MainUtils.O));

    }

    public void test5(){

        Board b = new Board(3);

        b.update(0,2, MainUtils.O);
        b.update(1,1, MainUtils.O);
        b.update(2,0, MainUtils.O);

        b.displayBoard();

        if (b.update(1, 2, MainUtils.X)){
            System.out.println("Done");
            b.displayBoard();
        }

        if (!b.update(1, 1, MainUtils.X)){
            System.out.println("Failed");
            b.displayBoard();
        }

    }

    public void test6(){

        Board b = new Board(3);

        b.update(0,0, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(0,1, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(0,2, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1,0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(1,1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1,2, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2,0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2,1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(2,2, MainUtils.O);
        System.out.println(b.isDraw());

        b.displayBoard();

    }

    public void test7(){

        Board b = new Board(3);

        b.update(0,0, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(0,1, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(0,2, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1,0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(1,1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1,2, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2,0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2,1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(2,2, MainUtils.X);
        System.out.println(b.isDraw());

        b.displayBoard();

    }

    public void test8(){

    }

}
