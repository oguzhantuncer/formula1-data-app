import { Component } from "react";
import { ListGroup } from "react-bootstrap";

export default class TeamItem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: this.props.id,
            name: this.props.name,
            chief: this.props.chief,
            base: this.props.base,
            chassis: this.props.chassis,
            powerUnit: this.props.powerUnit,
        };
    }
    render() {
        return (
            <ListGroup>
                <ListGroup.Item action variant="success">{this.state.name}</ListGroup.Item>
            </ListGroup>
        );
    }
}