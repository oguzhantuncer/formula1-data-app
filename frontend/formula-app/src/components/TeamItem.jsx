import { ListGroup } from "react-bootstrap";
import TeamCard from "./TeamCard";
import '../style.scss';
import { useState } from "react";

function TeamItem(props) {
  const [state, setState] = useState({
    id: props.id,
    name: props.name,
    chief: props.chief,
    base: props.base,
    chassis: props.chassis,
    powerUnit: props.powerUnit,
    className: "hidden"
  });

  const handleClick = () => {
    setState(prevState => ({ ...prevState, className: prevState.className === "hidden" ? "" : "hidden" }));
  };

  return (
    <ListGroup>
      <ListGroup.Item onClick={handleClick} action variant="success">{state.name}
        name : {state.name} <br />
      </ListGroup.Item>
        <TeamCard 
          className={state.className} 
          name={state.name} 
          chief={state.chief} 
          base={state.base} 
          chassis={state.chassis} 
          powerUnit={state.powerUnit} />
    </ListGroup>
  );
}

export default TeamItem;
