import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 每一个业务 Module 都需要配置的插件
 */
class ModulePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        LibPlugin().apply(project = project)
        CompilerConfigPlugin().apply(project = project)
        with(project) {
            dependencies.apply {
                add("implementation", libs.findLibrary("hilt").get().get().toString())
            }
        }
    }

}