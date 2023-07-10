import './App.css';
import { useState, useEffect } from 'react';
import TeamList from './components/TeamList';
import TeamItem  from './components/TeamItem';
import service from './service';

function App() {

  const [teams, setTeams] = useState([]);

  useEffect(() => {
    service.getAll()
      .then(response => {
        setTeams(response.data);
      })
      .catch(error => {
        console.log(error);
      });   
  }, []);

const teamList = teams.map(team =>
  <TeamItem
    key={team.id}
    id={team.id}
    name={team.name}
    chief={team.chief}
    base={team.base}
    chassis={team.chassis}
    powerUnit={team.powerUnit}
    />
  );

  return (
    <ul className="list-group">
            {teamList}
    </ul>
  );
}

export default App;
