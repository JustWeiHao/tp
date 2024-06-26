package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Birthday;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.RoomNumber;
import seedu.address.model.person.Telegram;
import seedu.address.model.tag.DormTag;
import seedu.address.model.tag.FreeTimeTag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ROOMNUMBER = "sw-01-01 2023-10-20";
    public static final String DEFAULT_TELEGRAM = "amyBee";
    public static final String DEFAULT_BIRTHDAY = "01/01/2000";
    public static final String DEFAULT_DORMTAG = "PGPR";

    private Name name;
    private Phone phone;
    private Email email;
    private RoomNumber roomNumber;
    private Telegram telegram;
    private Birthday birthday;
    private DormTag dormTag;
    private Set<FreeTimeTag> freeTimeTags;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = null;
        roomNumber = null;
        telegram = null;
        birthday = null;
        dormTag = null;
        freeTimeTags = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        roomNumber = personToCopy.getRoomNumber();
        telegram = personToCopy.getTelegram();
        birthday = personToCopy.getBirthday();
        dormTag = personToCopy.getDormTag();
        freeTimeTags = new HashSet<>(personToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Sets the {@code RoomNumber} of the {@code Person} that we are building.
     */
    public PersonBuilder withRoomNumber(String roomNumber) {
        this.roomNumber = new RoomNumber(roomNumber, true);
        return this;
    }

    /**
     * Sets the {@code Telegram} of the {@code Person} that we are building.
     */
    public PersonBuilder withTelegram(String telegram) {
        this.telegram = new Telegram(telegram);
        return this;
    }

    /**
     * Sets the {@code Birthday} of the {@code Person} that we are building.
     */
    public PersonBuilder withBirthday(String birthday) {
        this.birthday = new Birthday(birthday);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code DormTag} of the {@code Person} that we are building.
     */
    public PersonBuilder withDormTag(String dormTag) {
        this.dormTag = new DormTag(dormTag);
        return this;
    }

    /**
     * Sets the {@code FreeTimeTag} of the {@code Person} that we are building.
     */
    public PersonBuilder withFreeTimeTags(String ... freeTime) {
        this.freeTimeTags = SampleDataUtil.getTagSet(freeTime);
        return this;
    }

    public Person build() {
        return new Person(name, phone, email, roomNumber, telegram, birthday, dormTag, freeTimeTags);
    }

}
