package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Person.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPerson", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_person", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _person;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Person", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 40.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.34f, 134.05f);
        pathBuilder.lineTo(173.17f, 82.83f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -24.0f, -10.83f);
        pathBuilder.lineTo(106.83f, 72.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -24.0f, 10.83f);
        pathBuilder.lineTo(37.66f, 134.05f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.13f, 28.43f);
        pathBuilder.lineToRelative(16.3f, -13.08f);
        pathBuilder.lineTo(65.55f, 212.28f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 102.0f, 228.8f);
        pathBuilder.lineToRelative(26.0f, -44.87f);
        pathBuilder.lineToRelative(26.0f, 44.87f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 36.41f, -16.52f);
        pathBuilder.lineTo(173.91f, 149.4f);
        pathBuilder.lineToRelative(16.3f, 13.08f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.13f, -28.43f);
        pathBuilder.close();
        pathBuilder.moveTo(206.83f, 150.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.curveToRelative(-0.21f, -0.2f, -0.42f, -0.4f, -0.65f, -0.58f);
        pathBuilder.lineTo(165.0f, 121.76f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.26f, 130.0f);
        pathBuilder.lineTo(175.14f, 217.0f);
        pathBuilder.arcToRelative(7.72f, 7.72f, 0.0f, false, false, 0.48f, 1.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.25f, 3.38f);
        pathBuilder.arcToRelative(6.25f, 6.25f, 0.0f, false, false, -0.33f, -0.63f);
        pathBuilder.lineTo(134.92f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 0.0f);
        pathBuilder.lineTo(88.0f, 221.05f);
        pathBuilder.arcToRelative(6.25f, 6.25f, 0.0f, false, false, -0.33f, 0.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.26f, 2.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.45f);
        pathBuilder.arcToRelative(7.72f, 7.72f, 0.0f, false, false, 0.48f, -1.35f);
        pathBuilder.lineTo(103.74f, 130.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 91.0f, 121.76f);
        pathBuilder.lineTo(55.48f, 150.24f);
        pathBuilder.curveToRelative(-0.23f, 0.18f, -0.44f, 0.38f, -0.65f, 0.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.65f);
        pathBuilder.curveToRelative(0.12f, -0.12f, 0.23f, -0.24f, 0.34f, -0.37f);
        pathBuilder.lineTo(94.83f, 93.41f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.0f, -5.41f);
        pathBuilder.horizontalLineToRelative(42.34f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.0f, 5.41f);
        pathBuilder.lineToRelative(45.32f, 51.39f);
        pathBuilder.curveToRelative(0.11f, 0.13f, 0.22f, 0.25f, 0.34f, 0.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 206.83f, 150.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _person = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
