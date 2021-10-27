import image from "../assets/dRb.png";
import '../styles/header.css';

function Header(){
    return(
        <div className="header">
            <img src={image} alt="dRb Logo" />
            <div>
                <a href="#">Isso</a>
                <a href="#">É</a>
                <a href="#">Encheção</a>
                <a href="#">De</a>
                <a href="#">Linguiça</a>
            </div>
        </div>
    );
}; 

export default Header;