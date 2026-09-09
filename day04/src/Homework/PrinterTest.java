package Homework;


class Printer {
    
    private int numOFPapers;
    private boolean duplex;
    
    public Printer(int numOFPapers, boolean duplex) {
        this.numOFPapers = numOFPapers;
        this.duplex = duplex;
    }
    
    public void print(int amount) {
        int two;
        if(duplex == true) {
            two = (amount + 1) / 2;
        }else {
            two = amount;
        }
        
        String printType;
        if (duplex == true) {
            printType = "양면";
        } else {
            printType = "단면";
        }
        
        if(numOFPapers == 0) {
            System.out.println("용지가 없습니다");
        }else if (numOFPapers < two) {
            System.out.println(printType +"으로 출력하려면 용지가 " + (two - numOFPapers) + "매 부족합니다 " +
                    numOFPapers + "장만 출력합니다");
            numOFPapers = 0;
        }else {
            numOFPapers -= two;
            System.out.println(printType + "으로 " + two +"장 출력했습니다 현재 " + numOFPapers + "장 남아 있습니다");
        }
    }
    
    public boolean getDuplex() {
        return duplex;
    }
    
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}