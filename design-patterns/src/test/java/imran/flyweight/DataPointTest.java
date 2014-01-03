package imran.flyweight;

import org.junit.Test;

public class DataPointTest {

    @Test
    public void shouldUseExternalData_WhenMultipleObjectsRequested() {
        // given
        final DataPoint dataPoint = new DataPoint();
        final int size = ExternalizedData.SIZE;

        // when
        for (int i=0; i<size; i++) {
            dataPoint.setX(i, 2.05+i);
            dataPoint.setY(i, 4.65+i);
        }

        // then
        System.out.println(dataPoint.toString(size-1));
    }
}
