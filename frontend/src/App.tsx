import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className = "container">
        <h1 className="text-primary"> Semana Spring React 01 a 07/11/2021</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
