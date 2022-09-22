public class Main {
    public static void main(String[] args) {

        float masha = 67760;
        float denis = 83690;
        float krys = 76230;
        float onePercent = 0.01f;
        float totalPer = onePercent * 10;
        float monInY = 12;

        float mashaInc= masha * totalPer;
        float mashaNewSal = masha + mashaInc;
        float mashaYDif = (mashaNewSal * monInY) - (masha*monInY);
            System.out.println("Маша теперь получает " + mashaNewSal + " рублей. Годовой доход вырос на " + mashaYDif + " рублей.");

        float denisInc = denis * totalPer;
        float denisNewSal = denis + denisInc;
        float denisYDif = (denisNewSal * monInY) - (denis * monInY);
            System.out.println("Денис теперь получает " + denisNewSal + " рублей. Годовой доход вырос на " + denisYDif + " рублей.");

        float krysInc = krys * totalPer;
        float krysNewSal = krys + krysInc;
        float krysYDif = (krysNewSal * monInY) - (krys * monInY);
            System.out.println("Денис теперь получает " + krysNewSal + " рублей. Годовой доход вырос на " + krysYDif + " рублей.");

    }
}