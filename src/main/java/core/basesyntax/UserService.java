package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record: records) {
            String[] data = record.split(":");
            if (data.length == 2 && data[0].equals(email)) {
                return Integer.parseInt(data[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
