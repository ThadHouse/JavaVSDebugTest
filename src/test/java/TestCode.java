import java.util.ArrayList;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.wpi.first.networktables.NetworkTableInstance;

public class TestCode {
  @Test
    public void method() {
      NetworkTableInstance.getDefault();
        org.junit.Assert.assertTrue(new ArrayList().isEmpty());
    }
}
