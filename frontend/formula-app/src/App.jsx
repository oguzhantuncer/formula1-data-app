import './App.css';
import './style.scss';
import { useState, useEffect } from 'react';

import service from './service';

import TeamCard from './components/TeamCard';
import TeamItem  from './components/TeamItem';
import Navi from './components/Navi';

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

  const teamInfo = teams.map(team =>
    <TeamCard
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
    <>
      <Navi/>
      {teamList}
    </>
    
  );
}

export default App;
