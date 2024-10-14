import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 业务 Module 需要配置的插件, Module-Base 不可以在内
 */
class ModuleBusinessPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        ModulePlugin().apply(project = project)
        with(project) {
            dependencies.apply {
                add("api", project(":module-base"))
            }
        }
    }

}