import com.jcc.travel.entity.BasContract;
import com.jcc.travel.service.IContractService;
import com.jcc.travel.vo.ContractVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestSpring {
    @Autowired
    IContractService iContractService;

    @Test
    public void testRead() {
        ContractVo contractVo = new ContractVo ();
        contractVo.setBasId ( 1 );
        BasContract basContract = iContractService.read ( contractVo );
        System.out.println ( basContract );
    }
    @Test
    public void testDelete() {
        ContractVo contractVo = new ContractVo ();
        contractVo.setBasId ( 1 );
        iContractService.delete ( contractVo );
    }
    @Test
    public void testInsert() {
        ContractVo contractVo = new ContractVo ();
        contractVo.setBasId ( 7 );
        contractVo.setMoney ( new BigDecimal ( "200" ) );
        contractVo.setDate ( new Date ( 2018,5,5 ) );
        contractVo.setBasName ( "lux" );
        iContractService.create ( contractVo );
    }
    @Test
    public void testUpdate() {
        ContractVo contractVo = new ContractVo ();
        contractVo.setBasId ( 2 );
        contractVo.setMoney ( new BigDecimal ( "500" ) );
        iContractService.update ( contractVo );
    }
}
