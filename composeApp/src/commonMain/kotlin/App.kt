import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import presentation.repolist.RepoListScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(
            screen = RepoListScreen
        )
    }
}