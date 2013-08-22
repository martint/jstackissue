import org.codehaus.plexus.DefaultPlexusContainer;
import org.sonatype.aether.spi.log.Logger;

import java.lang.management.ManagementFactory;

public class Main
{
    public static void main(String[] args)
            throws Exception
    {
        DefaultPlexusContainer container = new DefaultPlexusContainer();
        container.lookup(Logger.class);

        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.substring(0, name.indexOf('@'));
        System.out.println("==================");
        System.out.println(String.format("To reproduce problem, run: 'jstack %s'", pid));
        Thread.currentThread().join();
    }
}
