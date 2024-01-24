package co.ground.gauth.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name="user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name = "facebook_id", nullable = false)
    private Long facebook_id;

    @Column(name = "studio_id", nullable = false)
    private Long studio_id;

    @Column(name = "level", nullable = false)
    private int level;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "file_id", nullable = false)
    private int file_id;

    @Column(name = "birth_year", nullable = false)
    private int birth_year;

    @Column(name="birth_month", nullable = false)
    private int birth_month;

    @Column(name="birth_day", nullable = false)
    private int birth_day;

    @Column(name="birth_date", nullable = false)
    private Long birth_date;

    @Column(name="contry_code", nullable = false)
    private String contry_code;

    @Column(name="language_code", nullable = false)
    private String language_code;

    @Column(name="filled", nullable = false)
    private boolean filled;

    @Column(name="registered_at", nullable = false)
    private LocalDateTime registered_at;

    @Column(name="unregistered_at", nullable = false)
    private LocalDateTime unregistered_at;

    @Column(name="updated_at", nullable = false)
    private LocalDateTime updated_at;

    @Column(name="reset_password_at", nullable = false)
    private int reset_password_at;

    @Column(name="deleted", nullable = false)
    private int deleted;

    @Column(name="verified", nullable = false)
    private boolean verified;

    @Column(name="identifier", nullable = false)
    private String identifier;

    @Column(name="agreed_terms", nullable = false)
    private boolean agreed_terms;

    @Column(name="agreed_terms_at", nullable = false)
    private LocalDateTime agreed_terms_at;

    @Column(name="subscribe_email", nullable = false)
    private boolean subscribe_email;

    @Column(name="influencer", nullable = false)
    private boolean influencer;

    @Column(name="permission", nullable = false)
    private boolean permission;

    @Column(name="join_ip", nullable = false)
    private String join_ip;

    @Column(name="login_ip", nullable = false)
    private String login_ip;

    @Column(name="google_id", nullable = false)
    private String google_id;

    @Column(name="os", nullable = false)
    private String os;

    @Column(name="browser", nullable = false)
    private String browser;

    @Column(name="ciso", nullable = false)
    private String ciso;

    @Column(name="cname", nullable = false)
    private String cname;

    @Column(name="lc_ver", nullable = false)
    private String lc_ver;

    @Column(name="device", nullable = false)
    private String device;

    @Column(name="apple_id", nullable = false)
    private String apple_id;

    @Column(name="loggedin_at", nullable = false)
    private LocalDateTime loggedin_at;

    @Column(name="section", nullable = false)
    private int section;

    @Column(name="withdrawal_request", nullable = false)
    private int withdrawal_request;

    @Column(name="auth_start_at", nullable = false)
    private LocalDateTime auth_start_at;

    @Column(name="auth_end_at", nullable = false)
    private LocalDateTime auth_end_at;

    @Column(name="reg_sup_at", nullable = false)
    private LocalDateTime reg_sup_at;

    @Column(name="fullname", nullable = false)
    private LocalDateTime fullname;

    @Builder
    public User(String email, String password, String auth) {
        this.email = email;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
