public class Elevator {
    public int currentFloor = 1;
    public int maxFloor;
    public int minFloor;

    public Elevator(int minFloor, int maxFloor){
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public int getCurrentFloor () {
        return currentFloor;
    }


    public void move(int floor) {
        System.out.println("Мы на "+getCurrentFloor()+" Этаже. ⚪");
        if (floor <= maxFloor && floor >= minFloor) {
            for (; currentFloor < floor;) {
                moveUp();
                if (currentFloor < floor) {
                    System.out.println("Мы на "+getCurrentFloor()+" Этаже. ↑");
                } else if (currentFloor == floor) {
                    System.out.println("Мы на "+getCurrentFloor()+" Этаже. ⚪");
                }
            }
            if (currentFloor > floor) {
                for (; currentFloor > floor; ) {
                    moveDown();
                    if (currentFloor > floor) {
                        System.out.println("Мы на "+getCurrentFloor()+" Этаже. ↓");
                    } else if (currentFloor == floor) {
                        System.out.println("Мы на "+getCurrentFloor()+" Этаже. ⚪");
                    }
                }
            }
        } else {
            System.out.println("Превышен лимит!");
        }
    }
}
