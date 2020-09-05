package seongju.rema.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seongju.rema.test.dao.TestDao;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public String getHostName() {

        return this.testDao.getHostName();
    }
}
