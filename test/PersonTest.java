import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    private Person jim;

    @Before
    public void setUp() {
        jim = new Person("Jim", "029", "1234567");
    }

    @Test
    public void should_get_name() {
        assertThat(jim.getName(), is("Jim"));
    }

    @Test
    public void should_get_office_area_code() {
        assertThat(jim.getOfficeAreaCode(), is("029"));
    }

    @Test
    public void should_get_office_number() {
        assertThat(jim.getOfficeNumber(), is("1234567"));
    }

    @Test
    public void should_get_telephone_number() {
        assertThat(jim.getTelephoneNumber(), is("029-1234567"));
    }
}
