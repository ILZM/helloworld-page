package kz.site.helloworld;

import kz.site.helloworld.mapper.PageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith ( SpringRunner.class )
@SpringBootTest
public class ApplicationTest
{
    @Autowired
    private PageMapper pageMapper;

    @Test
    public void checkMessage ( )
    {
        Assert.notNull ( this.pageMapper.getSiteMessage ( ), "Cannot retrieve a query" );
    }
}