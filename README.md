# Reactium

Reactium is a lightweight Minecraft: Bedrock Edition server software, forked from [PowerNukkitX](https://github.com/PowerNukkitX/PowerNukkitX).

Unlike BDS, Endstone, or PowerNukkitX itself, Reactium intentionally implements a **smaller subset of items and blocks**, following a minimalist philosophy closer to PocketMine-MP. The goal is a leaner, simpler core that's easier to maintain and extend, rather than full parity with vanilla content.

## Philosophy

- **Minimal by design** — not every item/block from vanilla Bedrock is implemented. If it's rarely used or adds excessive maintenance overhead, it may be left out (at least initially).
- **Built on proven ground** — Reactium inherits PowerNukkitX's performance-oriented architecture rather than starting from scratch.
- **Open and modifiable** — released as open source so the community can extend, fork, and adapt it.

## Status

🚧 Early development / actively forked from PowerNukkitX. Expect missing features, breaking changes, and incomplete item/block coverage while the project stabilizes.

## Comparison

| | Reactium | PowerNukkitX | BDS | Endstone |
|---|---|---|---|---|
| Base | PowerNukkitX fork | — | Official | BDS-based |
| Item/Block coverage | Minimal (curated subset) | Extensive | Full (vanilla) | Full (vanilla) |
| Philosophy | Lightweight, PocketMine-like | Feature-rich | Official reference | Plugin API layer over BDS |

## Installation

*(Add build/run instructions here once available.)*

```bash
git clone https://github.com/SchleroMC/Reactium.git
cd Reactium
# build instructions TBD
```

## Contributing

Contributions are welcome! Since Reactium favors a minimal item/block set, please open an issue to discuss significant additions before submitting a PR, so we can keep the scope aligned with the project's goals.

## License

This project is a fork of PowerNukkitX and retains its original license. See [LICENSE](LICENSE) for details.

## Credits

- [PowerNukkitX](https://github.com/PowerNukkitX/PowerNukkitX) — the base this project is forked from
- [Nukkit](https://github.com/CloudburstMC/Nukkit) — original project PowerNukkitX itself derives from
