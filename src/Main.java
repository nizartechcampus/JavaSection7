public class Main {


    public static void main(String[] args){
//        Dimensions dimensions=new Dimensions(20,20,5);
//        Case theCase =new Case("N100","240","GIGY",dimensions);
//        Resolution resolution=new Resolution(450,500);
//        Monitor monitor=new Monitor("T400","Sony",32,resolution);
//        Motherboard motherBoard=new Motherboard("T657","TTY",4,4,"ER54T");
//        PC thePC = new PC(monitor,motherBoard,theCase);
//
//
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
//        thePC.getMonitor().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
//        thePC.getTheCase().theCaseSize();
//        thePC.powerUp();
//        Printer printer=new Printer(50,true);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//        int pagesPrinted= printer.printPages(4);
//        System.out.println("pages was printed " + pagesPrinted);
//=======================================================================================
        // polymorphism
//        for(int i=1; i<11; i++) {
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i +
//                    " : " + movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n");
//        }
//
//    }
//
//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 5) +1;
//        System.out.println("Random number generated was: " + randomNumber);
//        switch (randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new Forgetable();
//        }
//
//        return null;


        //================================================================

//        Car car=new Car("BMW",6);
//
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        mitsubishi mist= new mitsubishi("Pajero",6);
//        System.out.println(mist.startEngine());
//        System.out.println(mist.brake());
    //==============================================================================
    Burger burger=new Burger("BeefBurger","Steak",12.2,"Brown rye");
    burger.addHamburgerAddition2("Cola",2.00);
        System.out.println("the total is -------> " + burger.itemizeHamburger());


       HealthyBurger healthyBurger=new HealthyBurger(4.53,"bacon");
       healthyBurger.addHealthAddition1("egg",2.12);
       healthyBurger.addHealthAddition2("salat",3.21);
        System.out.println("the total is -------> " + healthyBurger.itemizeHamburger());

        DeluxeBurger db=new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("green piper",1.01);



  }
}
