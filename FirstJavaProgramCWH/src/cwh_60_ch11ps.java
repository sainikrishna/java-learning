abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refilling");
    }
    public void changeNib(){
        System.out.println("Nib changed");
    }
}

class Monkey {
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal {
    void eat();
    void step();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Human Eating");
    }
    public void step(){
        System.out.println("Human step");
    }
}

interface TvRemote {
    void volumeUp();
    void volumeDown();
}

interface SmartTvRemote extends TvRemote {
    void openYoutube();
}

class Tv implements TvRemote {
    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        Monkey monkey = new Human();
//        monkey.eat(); --> Not allowed
        monkey.jump();
    }
}
