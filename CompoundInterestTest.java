

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CompoundInterestTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompoundInterestTest
{
    public static void main(String[] args){ 
   
        System.out.println(CompoundInterest(100, 5, 1));
        System.out.println(CompoundInterest(100, 5, 4));
        System.out.println(CompoundInterest(100, 5, 365));
        System.out.println(CompoundInterest(100, 5, 100));
        System.out.println(CompoundInterest(100, 5, 1000));
    }
}
