package task10;

public class Plane {
    int degree;
    int newDegree;
    Plane(int degree, int newDegree) {
        this.degree = degree;
        this.newDegree = newDegree;
    }

    public String calculateDregree(){
        int diff = newDegree - degree;
        if (diff > 180){
            diff -= 360;
        }else if (diff < -180){
            diff += 360;
        }

        if (diff > 0) return "Right turn";
        if (diff < 0) return "Left turn";
        else return "Straight";

    }
}
