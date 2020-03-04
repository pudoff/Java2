package lesson1.homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        Participants[] prtsnts = new Participants[3];
        Obstacles[] obstcls = new Obstacles[2];

        prtsnts[0] = new Human((Math.random()*(30-3)+3), (Math.random()*(4-1)+4));
        prtsnts[1] = new Cat((Math.random()*(20-3)+3), (Math.random()*(3-1)+3));
        prtsnts[2] = new Robot((Math.random()*(40-3)+3), (Math.random()*(5-1)+5));

        obstcls[0] = new Wall((Math.random()*(2-1)+2));
        obstcls[1] = new Treadmill((Math.random()*(15-3)+15));

        for (int i = 0; i < prtsnts.length; i++) {
            System.out.println((i+1) + "_________________________");
            int ank = 0;
            for (int j = 0; j < obstcls.length ; j++) {

                    ank++;
                if (obstcls[j].overcoming(prtsnts[i]) == true) {
                    System.out.println(prtsnts[i].getType() + " успешно преодолел препятствие № " + (j+1) );
                    if (ank == obstcls.length) {
                        System.out.println(prtsnts[i].getType() + " успешно прошел все препятствия");
                    }
                } else {
                    System.out.println("К сожалению, " + prtsnts[i].getType() + " не смог преодолеть препятсвие № " + (j+1) +
                            " и сошел с дистанции");
                    break;

                }


            }

        }



    }
}
