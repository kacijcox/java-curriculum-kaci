//package bigdecimal;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//
//public class BigDecimalLessonTest {
//
//    @Test
//    public void BigDecimalLesson_getChange_validateGetsChange(){
//        // Arrange
//        BigDecimal amount = new BigDecimal(".82");
//        Map<String, Integer> changeTestMap = new HashMap<>();
//        // Quarters: 3
//        changeTestMap.put("Quarters", 3);
//        // Nickles: 1
//        changeTestMap.put("Nickles", 1);
//        // Pennies 2
//        changeTestMap.put("Pennies", 2);
//
//        // Act
//        Map<String, Integer> result = BigDecimalLesson.getChange3(amount);
//
//        // Assert
//
//        Assert.assertEquals(result.get("Quarters"), changeTestMap.get("Quarters"));
//        Assert.assertFalse(result.containsKey("Dimes"));
//        Assert.assertEquals(result.get("Nickles"), changeTestMap.get("Nickles"));
//        Assert.assertEquals(result.get("Pennies"), changeTestMap.get("Pennies"));
//
//
//    }
//}
