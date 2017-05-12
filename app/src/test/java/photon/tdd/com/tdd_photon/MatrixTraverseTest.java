package photon.tdd.com.tdd_photon;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gayathri on 5/5/2017.
 */
public class MatrixTraverseTest {


    @Test
    public void traverse(){
        String cost;
        String path;
        String des;
        int sample1[][] = { { 3, 4, 1, 2, 8, 6 },
                { 6, 1, 8, 2, 7, 4 },
                { 5, 9, 3, 9, 9, 5 },
                { 8, 4, 1, 3, 2, 6 },
                { 3, 7, 2, 8, 6, 4 }
        };
     MatrixTraverse mat=new MatrixTraverse(sample1);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample1);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(16,trcost);
    }
    @Test
    public void traverseFirst(){
        String cost;
        String path;
        String des;
        int sample1[][] = { { 3, 4, 1, 2, 8, 6 },
                { 6, 1, 8, 2, 7, 4 },
                { 5, 9, 3, 9, 9, 5 },
                { 8, 4, 1, 3, 2, 6 },
                { 3, 7, 2, 1, 2, 3 }
        };
        MatrixTraverse mat=new MatrixTraverse(sample1);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample1);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(11,trcost);
    }

    @Test
    public void traverseSecond(){
        String cost;
        String path;
        String des;
        int sample[][] = { { 19, 10, 19, 10, 19 }, { 21, 23, 20, 19, 12 }, { 20, 12, 20, 11, 10 } };
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(48,trcost);
    }
    @Test
    public void traverseThird(){
        String cost;
        String path;
        String des;
        int sample[][]={{5, 8, 5, 3, 5}};
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(26,trcost);
    }
    @Test
    public void traverseFour(){
        String cost;
        String path;
        String des;
        int sample[][]={{5},
                {8},
                {5},
                {3},
                {5}};
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(3,trcost);
    }
    @Test
    public void traverseFive(){
        String cost;
        String path;
        String des;
        int sample[][]={{69,10, 19, 10, 19},
                {51 ,23 ,20 ,19 ,12},
                {60 ,12 ,20 ,11 ,10}};
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(0,trcost);
    }
    @Test
    public void traverseSix(){
        String cost;
        String path;
        String des;
        int sample[][]={{60 ,3, 3, 6},
                {6, 3 ,7 ,9},
                {5, 6 ,8 ,3}};
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(14,trcost);
    }
    @Test
    public void traverseSeven(){
        String cost;
        String path;
        String des;
        int sample[][]={{6,3,-5,9},
                {-5,2,4,10},
                {3,-2,6,10},
                {6,-1,-2,10}};
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(0,trcost);
    }
    @Test
    public void traverseEight(){
        String cost;
        String path;
        String des;
        int sample[][]={{51,51},
                {0 ,51},
                {51 ,51},
                {5 ,5}
        };
        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(10,trcost);
    }
    @Test
    public void traversenine(){
        String cost;
        String path;
        String des;
        int sample[][]={
                {51,51,51},
                {0,51,51},
                {51, 51, 51},
                {5, 5 ,51}
        };

        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(10,trcost);
    }
    @Test
    public void traversenten(){
        String cost;
        String path;
        String des;
        int sample[][] = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }
        };

        MatrixTraverse mat=new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path=trv.get(1);
        des=trv.get(2);
        assertEquals(20,trcost);

    }


}