package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ruixj on 17-5-9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
                       "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillService seckillService;
    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void getById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}",seckill);
    }

    @Test
    public void exportSeckillUrl() throws Exception {
        long id=1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);

        logger.info("exposer: {}",exposer);
        /*
         exposer: Exposer{
                        exposed=true,
                        md5='8a0dc47369b99d81c876ee1a25264b2c',
                        seckillId=1000,
                        now=0,
                        start=0,
                        end=0
                  }

         */
    }

    @Test
    public void testSeckillLogic() throws Exception {
        long id=1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        if(exposer.isExposed())
        {
            logger.info("exposer: {}",exposer);
            /*
             exposer: Exposer{
                            exposed=true,
                            md5='8a0dc47369b99d81c876ee1a25264b2c',
                            seckillId=1000,
                            now=0,
                            start=0,
                            end=0
                      }

             */
            long phone = 13810581298L;
            String md5 = exposer.getMd5();
            try
            {
                SeckillExecution execution = seckillService.executeSeckill(id,phone,md5);
                logger.info("result = {}",execution);
            }
            catch(RepeatKillException e)
            {
                logger.error(e.getMessage());
            }
            catch(SeckillCloseException e)
            {
                logger.error(e.getMessage());
            }
        }
        else
        {
            logger.warn("exposer={}",exposer);
        }

    }

    @Test
    public void executeSeckill() throws Exception {
        long id = 1000;
        long phone = 13810581299L;
        String md5 = "8a0dc47369b99d81c876ee1a25264b2c";
        SeckillExecution execution = seckillService.executeSeckill(id,phone,md5);
        logger.info("result = {}",execution);

    }

}