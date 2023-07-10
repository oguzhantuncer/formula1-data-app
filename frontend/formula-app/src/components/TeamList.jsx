import { Component } from "react";
import { ListGroup } from "react-bootstrap";

export default class TeamList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: this.props.id,
            name: this.props.name,
        };
    }
    render() {
        return (
            <ListGroup>
            </ListGroup>
        );
    }
}