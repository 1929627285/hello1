
import domain.Arcitle;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ArcitleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringDateesTest {

    @Autowired
    private ArcitleService arcitleService;
    @Autowired
    private TransportClient client;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void createindex(){
        elasticsearchTemplate.createIndex(Arcitle.class);
        elasticsearchTemplate.putMapping(Arcitle.class);
    }
}
