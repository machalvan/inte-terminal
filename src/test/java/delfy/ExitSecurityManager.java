package delfy;

import java.security.Permission;

public class ExitSecurityManager extends SecurityManager {

    public static final class ExitSecurityException extends SecurityException {
        private final int status;

        public ExitSecurityException(final int status) {
            this.status = status;
        }

        public int getStatus() {
            return this.status;
        }
    }

    @Override
    public void checkExit(final int status) {
        throw new ExitSecurityException(status);
    }

    @Override
    public void checkPermission(Permission perm) {
    }
}
