import React from "react";
import "./House.css";
import { Link } from "react-router-dom";

const House = (props) => {
    return (
        <>
            <div className="col">
                <div className="card shadow-sm">
                    <div>
                        <Link to={"/house-detail/" + props?.property?.id}>
                            <img src="https://ap.rdcpix.com/5fe850a043989a3b24730a05621a8849l-m563540908od-w480_h360.webp" alt={props?.property?.title}/>
                        </Link>
                    </div>

                    <div className="card-body">
                        <Link to={"/house-detail/" + props?.property?.id}>
                            <h5 className="card-title">{props.property.title}</h5>
                        </Link>
                        <p className="card-text">
                            {props.property.description.substring(0, 200) + (props.property.description.length > 200 ? "..." : "")}
                        </p>
                        <ul className="list-group list-group-flush">
                            <li className="list-group-item">
                                Price $ {props.property.price}
                            </li>
                            <li className="list-group-item">
                                BedRooms: {props.property.noOfBedrooms}
                            </li>
                            <li className="list-group-item">
                                Bathrooms. {props.property.noOfBathrooms}
                            </li>
                            <li className="list-group-item">
                                Area. {props.property.area}
                            </li>
                            <li className="list-group-item">
                                Land Extent. {props.property.plotSize}
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </>
    );
};

export default House;
