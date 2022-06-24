package Injector;

import java.io.File;
import java.io.IOException;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

public class Injector {

    public static void inject() throws Exception,IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        System.out.println("Injecting...");
        String pid = null;
        for (VirtualMachineDescriptor jvm : VirtualMachine.list()) {
            System.out.println(jvm.displayName());
            if ((jvm.displayName().startsWith("net.minecraft.client.main.Main"))) /* Example Injection */ {
                pid = jvm.id();
            }
        }
        if (pid != null) {
            VirtualMachine vm = VirtualMachine.attach(pid);
            vm.loadAgent(new File(Main.name).getAbsolutePath());
        }
        System.out.println(ANSI.GREEN + "Injected! [PID: " + ANSI.PURPLE + pid + ANSI.GREEN + "]");
    }

}