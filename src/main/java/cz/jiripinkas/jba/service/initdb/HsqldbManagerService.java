package cz.jiripinkas.jba.service.initdb;

import cz.jiripinkas.jba.annotation.DevProfile;
import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@DevProfile
@Service
public class HsqldbManagerService {

    @PostConstruct
    public void getDbManager() {
        DatabaseManagerSwing.main(
                new String[]{"--url", "jdbc:hsqldb:mem:test", "--user", "sa", "--password", "", "--noexit"});
    }

}
