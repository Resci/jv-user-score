package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        for (String record: records) {
            String[] recordSplit = record.split(":");
            if (recordSplit.length == 2 && recordSplit[0].equals(email)) {
                return Integer.parseInt(recordSplit[1]);
            }
        }
        throw new UserNotFoundException();
    }
}
