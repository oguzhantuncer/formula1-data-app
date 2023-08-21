import React from 'react';
import { Card } from 'react-bootstrap';
import '../style.scss';
import { path} from 'path';

function getTeamImageSrc(teamName) {
  const imagePath = path.join(__dirname, '../images', teamName + '.png');
  return require(imagePath).default;
}

function TeamCard(props) {
  const teamImageSrc = getTeamImageSrc(props.name);
  
  return (
    <Card className='' style={{ width: '18rem' }}>
      <Card.Img variant="top" src={(teamImageSrc)} />
      <Card.Body className={props.className}>
        <Card.Title>{props.name}</Card.Title>
        <Card.Text>{props.chief}</Card.Text>
        <Card.Text>{props.base}</Card.Text>
        <Card.Text>{props.chassis}</Card.Text>
        <Card.Text>{props.powerUnit}</Card.Text>
      </Card.Body>
    </Card>
  );
}

export default TeamCard;

