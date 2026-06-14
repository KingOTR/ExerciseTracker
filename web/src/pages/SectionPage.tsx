interface SectionPageProps {
  title: string;
  description: string;
}

export function SectionPage({ title, description }: SectionPageProps) {
  return (
    <section className="section-card">
      <h2>{title}</h2>
      <p>{description}</p>
      <p className="placeholder-note">Scaffold placeholder — sync with Firestore in Phase 2.</p>
    </section>
  );
}
