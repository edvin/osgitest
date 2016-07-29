package app

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import tornadofx.osgi.ApplicationProvider
import java.util.*

class Activator : BundleActivator {
    override fun start(context: BundleContext) {
        println("Starting bundle!")
        context.registerService(MyAppProvider::class.java, MyAppProvider(), Hashtable<String, String>())
    }

    override fun stop(context: BundleContext) {
    }
}

class MyAppProvider : ApplicationProvider {
    override val application = MyApp::class
}