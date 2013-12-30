package imran.template;

import org.junit.Test;

public class ImplementationClassTest {

    private GeneralClass generalClass;

    @Test
    public void shouldCallImplementedAbstractMethods_WhenTemplateMethodIsCalled() {
        // given
        generalClass = new ImplementationClass();

        // when
        generalClass.templateMethod();

        // then
        // should print to std out
    }
}
