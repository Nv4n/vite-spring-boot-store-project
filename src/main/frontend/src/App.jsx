import { createRoot } from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";

const App = () => {
	return (
		<BrowserRouter>
			<Routes>
				<Route path="/" element=""></Route>
			</Routes>
		</BrowserRouter>
	);
};

const container = document.getElementById("root");
const root = createRoot(container);
root.render(<App></App>);
